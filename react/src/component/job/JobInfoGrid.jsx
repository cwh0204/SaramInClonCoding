import JobInfoRow from "./JobInfoRow";

function JobInfoGrid({ left, right }) {
  return (
    <div className="flex gap-[40px]">
      <div className="flex-1">
        {left.map((item) => (
          <JobInfoRow key={item.label} label={item.label} value={item.value} highlight={item.highlight} suffix={item.suffix} />
        ))}
      </div>

      <div className="flex-1">
        {right.map((item) => (
          <JobInfoRow key={item.label} label={item.label} value={item.value} highlight={item.highlight} suffix={item.suffix} />
        ))}
      </div>
    </div>
  );
}

export default JobInfoGrid;
